(ns bubbles.core
  (:import (com.badlogic.gdx Game)
           (com.badlogic.gdx.backends.lwjgl LwjglApplication
                                            LwjglApplicationConfiguration))
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [game (proxy [Game] [] (create [] ()))]
    (LwjglApplication. game)))
