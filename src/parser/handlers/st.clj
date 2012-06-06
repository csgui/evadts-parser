(ns parser.handlers.st)

(defn handle-st [data]
  (hash-map "ST" (for [value data] (hash-map "id" (inc (.indexOf data value)) "value" value))))
