(ns parser.group-handler
  (:use [parser.handlers.dxs]
        [parser.handlers.st]
        [parser.handlers.id1]))

(def group-handlers
  {"DXS" handle-dxs,
   "ST"  handle-st,
   "ID1" handle-id1})
