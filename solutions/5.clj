(defn increment-by
  "lazy seq for increment by x"
  ([x]
   (concat [x] (increment-by x x)))
  ([previous x]
   (let [n (+ previous x)]
     (lazy-seq
       (cons n (increment-by n x))))))

(defn collection_divisible?
  "returns true if the number is divisble by everything in the collection"
  [number coll]
  (every? #(= (rem number %) 0) coll))

(defn smallest_divisible_number
  "returns the smallest divisible number of all the numbers"
  [coll]
  (let [max_number (last (sort coll))]
    (+
      (last
        (take-while
          #(not (collection_divisible? % coll))
          (increment-by max_number)))
      max_number)))

(println (smallest_divisible_number (range 1 11)))
(println (smallest_divisible_number (range 1 21)))
