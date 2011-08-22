(ns com.logicalpractice.fizzbuzz
  (:gen-class
    :name com.logicalpractice.fizzbuzz.ClojureFizzBuzzer
    :implements [com.logicalpractice.fizzbuzz.FizzBuzzer])
  )

(defn fizz-buzz
  "returns the 'fizzbuzz' of a number"
  [i] (let [div3 (= (mod i 3) 0)
            div5 (= (mod i 5) 0)]
  (cond
    (and div3 div5) "FizzBuzz"
    div3 "Fizz"
    div5 "Buzz"
    :else (str i))))

(defn fizz-buzz-seq
  "returns a lazy sequences of fizzbuzz items"
  [] (map fizz-buzz (iterate inc 1)))

(defn -writeFizzBuzzWithLimitTo
  "implement the fizz buzz method"
  [this limit printWriter]
  (cond
    (< limit 1) (throw (IllegalArgumentException. "limit must be positive integer"))
    (nil? printWriter) (throw (IllegalArgumentException. "printWriter is required"))
    :else (doseq [s (take limit (fizz-buzz-seq))]
    (.println printWriter s))
    ))
