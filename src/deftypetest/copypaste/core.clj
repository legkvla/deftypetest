(ns deftypetest.copypaste.core
  (:require
    [deftypetest.copypaste.hardcore :refer :all]
    )
  (:gen-class)
  )

(defn -main [& args]
  (println "Hello " (sfn "10"))
  )
