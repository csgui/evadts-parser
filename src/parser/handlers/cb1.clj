(ns parser.handlers.cb1)

(defn handle-cb1 [data]
  (hash-map "CB1" (for [value data] (hash-map "id" (inc (.indexOf data value)) "value" value))))
