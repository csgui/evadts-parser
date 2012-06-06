(ns parser.handlers.dxs)

(defn handle-dxs [data]
  (hash-map "DXS" (for [value data] (hash-map "id" (inc (.indexOf data value)) "value" value))))
