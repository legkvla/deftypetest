(ns deftypetest.naive.core
  (:require 
    [deftypetest.naive.protocol :refer :all]
    [deftypetest.naive.type :refer [pirate-shouter]])
  (:gen-class))

(def pirate (pirate-shouter))
(shout pirate "Hello, world")

(defn -main [& args] (println "main"))