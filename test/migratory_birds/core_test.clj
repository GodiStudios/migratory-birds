(ns migratory-birds.core-test
  (:require [clojure.test :refer :all]
            [migratory-birds.core :refer :all]))

(def test-vec [1 3 4 4 3 4 2 4 1 3 4])

(def test-vec-eq [1 3 3 4 4 3 4 3 2 4 1 3 4])


(deftest generate-rand-values
  (testing "Testing generated array"
    (is (< (count (randon-vector-generator)) 200000))
    (is (every? (partial >= 5) (randon-vector-generator)))
    (is (every? (partial <= 1) (randon-vector-generator)))))

(deftest get-highest-value
  (testing "Returns the highest count values"
    (is (= 4 (migratory-birds test-vec)))
    (is (= 3 (migratory-birds test-vec-eq)))))

