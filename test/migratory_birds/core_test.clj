(ns migratory-birds.core-test
  (:require [clojure.test :refer :all]
            [migratory-birds.core :refer :all]))

(deftest generate-rand-values
  (testing "Testing generated array"
    (is (< (count (randon-vector-generator)) 200000))
    (is (every? (partial >= 5) (randon-vector-generator)))
    (is (every? (partial <= 1) (randon-vector-generator)))))

