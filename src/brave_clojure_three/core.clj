(ns brave-clojure-three.core
  (:gen-class))

(defn -main
  [& args]
  (println (str "It was the panda " "in the library " "with a dust buster"))
  (println (str "And 1 plus 2 plus three should equal " (+ 1 2 3))))
