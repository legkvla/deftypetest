(defproject deftypetest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.novemberain/monger "3.0.2"]
                 [ring-server "0.4.0"]
                 [ring "1.5.0"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-defaults "0.2.1"]
                 [ring-logger "0.7.7"]
                 [buddy "1.3.0"]
                 [buddy/buddy-auth "1.4.1"]
                 [compojure "1.5.1"]
                 [hiccup "1.0.5"]
                 [environ "1.0.0"]
                 [yogthos/config "0.8"]
                 ;todo get rid of prone here in future
                 [prone "1.1.4"]
                 [org.clojure/tools.trace "0.7.9"]
                 [clj-yaml "0.4.0"]
                 [clj-http "2.3.0"]
                  ]
  :main  deftypetest.copypaste.core
  :min-lein-version "2.5.0"
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all :env {:production true} :omit-source true}})
