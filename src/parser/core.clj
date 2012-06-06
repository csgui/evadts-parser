(ns parser.core
  (:require [clojure.java.io :as io]
            [clojure.string  :as str])
  (:use [parser.group-handler]
        [clojure.data.json]))

(defn group-identifier [line]
  (keyword (first (str/split line #"\*"))))

(defn group-data [line]
  (rest (str/split line #"\*")))

(defn parse [line]
  (if-let [group-handler (retrieve-group-handler (group-identifier line))]
    (group-handler (group-data line))
    (println "Unknown group!")))

(with-open [rdr (io/reader "/Users/christian/DTS_29_05.txt")]
  (doseq [line (line-seq rdr)]
    (print (parse line))))
