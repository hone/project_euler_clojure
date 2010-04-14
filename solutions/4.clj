(use '[clojure.contrib.str-utils :only (str-join)])

(defn palindrome?
  "check to see if the number is a palindrome"
  [number]
  (let [string_number (str number)
        max_index (quot (.length string_number) 2)]
    (every?
      (fn [index] (=
                    (get string_number index)
                    (get (str-join "" (reverse string_number)) index)))
      (range 0 (+ max_index 1)))))

(defn palindromes
  "generate all palindromes from start number to ending number"
  [start end]
  (let [three_digit_numbers (range start end)
        products (for [x three_digit_numbers
                       y three_digit_numbers]
                   (* x y))]
    (filter palindrome? products)))

(println (last (sort (palindromes 100 1000))))
