(ns deftypetest.copypaste.repository)

(defprotocol Repository
  (index [this fields unique])
  )