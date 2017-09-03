(ns deftypetest.naive.type (:require [deftypetest.naive.protocol :refer [Shouter]]))

(deftype PirateShouter []
  Shouter
  (shout [this text] 
    (println (str text ", me Hearties"))))

(defn pirate-shouter [] (PirateShouter.))