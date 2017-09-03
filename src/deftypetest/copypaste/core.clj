(ns deftypetest.copypaste.core
  (:require 
    [deftypetest.copypaste.repository :refer :all]
    [deftypetest.copypaste.mongo :refer [mongo-repository mongo-db]]
    ))

(def chatbox-sessions-storage (mongo-repository mongo-db "some_table"))
(index chatbox-sessions-storage [:smth] :unique)