(ns brave-clojure-three.core
  (:gen-class))

(defn -main
  [& args]
  ;; STRINGS
  (println "It was the panda " "in the library " "with a dust buster")
  (println (str "And 1 + 2 + 3 should equal " (+ 1 2 3)))

  ;; CONTROL FLOW
  (if true
    (println "By Zeus's Hammer!")
    (println "By Aquaman's Trident!"))
  (if false
    (println "By Zeus's Hammer!")
    (println "By Aquaman's Trident!"))
  (if true
    (do (println "Success!")
        "By Zeus's hammer!") ;; returned in REPL
    (do (println "Failure!")
        "By Aquaman's trident!")) ;; returned in REPL
  (when true
    (println "Success!")
    "abra cadabra") ;; returned in REPL

  ;; BOOLEANS and NIL
  (nil? 1) ;; returns false
  (nil? nil) ;; returns true
  (if "bears eat beets"
    (println "bears beets Battlestar Galactica"))
  (if nil
    (println "This won't be the result because nil is falsey")
    (println "nil is falsey"))
)
