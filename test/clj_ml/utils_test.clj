(ns clj-ml-dev.utils-test
  (:use [clj-ml-dev utils] :reload-all)
  (:use [clojure.test]))

(deftest test-into-fast-vecotor
  (is (= ["a" "B" "c"]
           (vec (.toArray (into-fast-vector ["a" "B" "c"]))))))
