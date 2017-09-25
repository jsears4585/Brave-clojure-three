(ns brave-clojure-three.core
  (:gen-class))

(defn -main
  [& args]
  (println "It was the panda " "in the library " "with a dust buster")
  (println (str "And 1 + 2 + 3 should equal " (+ 1 2 3)))
  (if true
    (println "By Zeus's Hammer!")
    (println "By Aquaman's Trident!"))
  (if false
    (println "By Zeus's Hammer!")
    (println "By Aquaman's Trident!"))
)
