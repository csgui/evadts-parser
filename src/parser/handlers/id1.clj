(ns parser.handlers.id1)

(defn handle-id1 [data]
  (hash-map "ID1" (for [value data] (hash-map "id" (inc (.indexOf data value)) "value" value))))
