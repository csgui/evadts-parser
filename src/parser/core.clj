(ns parser.core
  (:require [clojure.java.io :as io]
            [clojure.string  :as str])
  (:use [parser.group-handler]))

(defn get-group-identifier [line]
  (keyword (first (str/split line #"\*"))))

(defn get-information [line]
  (rest (str/split line #"\*")))

(defn parse [line]
  (if-let [handler (retrieve-group-handler (get-group-identifier line))]
    (handler (get-information line))
    (println "Unknown group!")))

(with-open [rdr (io/reader "/Users/christian/DTS_23_05.txt")]
  (doseq [line (line-seq rdr)]
    (parse line)))
