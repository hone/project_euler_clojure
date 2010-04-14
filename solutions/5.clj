(defn collection_divisible?
  "returns true if the number is divisble by everything in the collection"
  [number coll]
  (every? #(= (rem number %) 0) coll))

(defn smallest_divisible_number
  "returns the smallest divisible number of all the numbers"
  [coll]
  (+
    (last
      (take-while
        #(not (collection_divisible? % coll))
        (iterate inc 1)))
    1))

(println (smallest_divisible_number (range 1 11)))
(println (smallest_divisible_number (range 1 21)))
