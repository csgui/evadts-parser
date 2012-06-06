(ns parser.handlers.va1)

(defn handle-va1 [data]
  (hash-map "VA1" (for [value data] (hash-map "id" (inc (.indexOf data value)) "value" value))))
