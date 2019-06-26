(ns migratory-birds.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (migratory-birds (randon-vector-generator)))

(defn randon-vector-generator []
  (let [rand-vec (atom [])]
    (dotimes [x (rand-int 200000)] 
      (swap! rand-vec conj (+ 1 (rand-int 5))))
    @rand-vec))

(defn migratory-birds [vec]
  (->> vec
    (sort)
    (frequencies)
    (sort-by val >)
    (first)
    (first)))