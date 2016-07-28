(defproject bubbles "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.badlogicgames.gdx/gdx "1.9.4-SNAPSHOT"]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl "1.9.4-SNAPSHOT"]
                 [com.badlogicgames.gdx/gdx-platform "1.9.4-SNAPSHOT"
                  :classifier "natives-desktop"]]
  :main ^:skip-aot bubbles.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :repositories [["gdx-nightlies" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                   :snapshots true}]])
