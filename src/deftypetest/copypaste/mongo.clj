(ns deftypetest.copypaste.mongo
  (:require
    [monger.core :as mg]
    [monger.collection :as mc]

    [deftypetest.copypaste.repository :refer :all]
    )
  (:import org.bson.types.ObjectId)
  )

(def db-url "mongodb://127.0.0.1/bots")
(def mongo-db ((mg/connect-via-uri db-url) :db))

(deftype MongoRepository [db collection-name]
  Repository

  (index [this fields unique]
    ; unique can be a boolean or a keyword
    (let [unique? (case unique :unique true :non-unique false unique)]
      (mc/ensure-index db collection-name fields {:unique unique?})
      )
    )
  )

(defn mongo-repository [db collection-name] (MongoRepository. db collection-name))