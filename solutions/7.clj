(defn next_prime
  "find the next prime in the sequence"
  ([previous_primes]
   (next_prime (+ (last previous_primes) 2) previous_primes))
  ([n previous_primes]
   (if
     (not-any? #(= (rem n %) 0) previous_primes)
     n
     (recur (+ n 2) previous_primes))))
     
(defn prime_sequence
  "lazy sequence of primes"
  ([]
   (concat [2 3] (prime_sequence [2 3])))
  ([previous_primes]
   (let [n (next_prime previous_primes)
         new_primes (conj previous_primes n)]
     (lazy-seq
       (cons n (prime_sequence new_primes))))))

(println (last (take 10001 (prime_sequence))))
