(ns parser.try
  (:use [parser.handlers.dxs]))

(defmulti handler (fn [x] x))

(defmethod handler "DXS"
  [x] (handle-dxs line))

(defmethod handler "ST"
  (handle-st line))
