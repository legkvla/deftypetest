(defproject deftypetest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"] [com.novemberain/monger "3.0.2"]]
  :main ^:skip-aot deftypetest.naive.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})