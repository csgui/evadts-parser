(ns parser.group-handler
  (:use [parser.handlers.dxs]
        [parser.handlers.st]
        [parser.handlers.id1]
        [parser.handlers.cb1]
        [parser.handlers.va1]))

(defmulti retrieve-group-handler (fn [x] x) :default :unknown-group-handler)

(defmethod retrieve-group-handler :DXS [_]
  handle-dxs)

(defmethod retrieve-group-handler :ST [_]
  handle-st)

(defmethod retrieve-group-handler :ID1 [_]
  handle-id1)

(defmethod retrieve-group-handler :CB1 [_]
  handle-cb1)

(defmethod retrieve-group-handler :VA1 [_]
  handle-va1)

(defmethod retrieve-group-handler :unknown-group-handler [_]
  nil)
