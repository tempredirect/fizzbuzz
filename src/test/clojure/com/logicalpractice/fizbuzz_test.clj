(ns com.logicalpractice.fizbuzz-test
  (:use clojure.test com.logicalpractice.fizzbuzz))

(deftest fizz-buzz-test
  (testing "with simple numbers"
    (is (= (fizz-buzz 1) "1"))
    (is (= (fizz-buzz 11) "11")))
  (testing "Fizz divisable by 3 but not 5"
    (is (= (fizz-buzz 3) "Fizz"))
    (is (= (fizz-buzz 9) "Fizz")))
  (testing "Buzz divisable by 5 but not by 3"
    (is (= (fizz-buzz 10) "Buzz"))
    (is (= (fizz-buzz 20) "Buzz")))
  (testing "FizzBuzz"
    (is (= (fizz-buzz 30) "FizzBuzz"))
    (is (= (fizz-buzz 15) "FizzBuzz"))
    )
  )

(deftest fizz-buzz-seq-test
  (testing "first 5 items"
    (is (= (take 5 (fizz-buzz-seq)) '("1" "2" "Fizz" "4" "Buzz"))))
  (testing "FizzBuzz items")
  ;;; zero index 15 & 30
  (is (= (nth (fizz-buzz-seq) 14) "FizzBuzz"))
  (is (= (nth (fizz-buzz-seq) 29) "FizzBuzz"))
  )

