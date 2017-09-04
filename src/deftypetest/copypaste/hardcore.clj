(ns deftypetest.copypaste.hardcore
  (:require
    [deftypetest.copypaste.repository :refer :all]
    [deftypetest.copypaste.mongo :refer [mongo-repository mongo-db]]
    ))

(defn sfn [a] a)

(def a "Hello")
(def B "Bye!")

(def chatbox-sessions-storage (mongo-repository mongo-db "some_table"))
(index chatbox-sessions-storage [:smth] :unique)

(defn some-function [] nil)
