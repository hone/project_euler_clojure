(defn sum_of_squares
  "Sum of the squares of a collection of numbers"
  [coll]
  (reduce
    #(+ %1 %2)
    0
    (map #(* % %) coll)))

(defn square_of_sums
  "Square of the sums of a collection of numbers"
  [coll]
  (let [x (reduce
            #(+ %1 %2)
            0
            coll)]
    (* x x)))

(defn difference_of_sums_and_squares
  "Difference of the square of the sums and the sum of the squares"
  [coll]
  (- (square_of_sums coll) (sum_of_squares coll)))

(println (sum_of_squares (range 1 11)))
(println (square_of_sums (range 1 11)))
(println (difference_of_sums_and_squares (range 1 11)))

(println (sum_of_squares (range 1 101)))
(println (square_of_sums (range 1 101)))
(println (difference_of_sums_and_squares (range 1 101)))
