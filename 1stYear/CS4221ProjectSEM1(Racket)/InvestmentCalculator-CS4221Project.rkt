#lang racket
#|OLAN HEALY ID:21318204|#
;;PROBLEM: I have implemented a program so as it let's you convienently and efficently caculate base returns if you were to invest in this long term stock ( NOT REAL: just wanted the returns feature like a stock).
;; I have a great interest in investing and finance in general and i think this is a clean and efficent program that can give you a return efficently and was a fun and unique program to make
;; I encountered challenges during this project and my code completely changed from my first draft.
(display "Please input a certain amount of money: ") ;; dimply display message telling the user to input money
;;I used this conditional statement to sort out malformed data if it was implemented. Instead of having a set test data set I think its more personalsied if the user gets to input what they wiah
(define money (read)) (cond ((not( number? money ) ) (display "ERROR: PRESS RUN AGAIN: Please only enter in whole numbers as money") (exit 0)) ;;if a number is not inputted displays error message
                            ((not(positive? money ))((display "ERROR: PRESS RUN AGAIN: Please only enter positive whole numbers as money")(exit 0))));;if a negative number(or 0) is  inputted displays error messag

                                                                                        

(display "Please input a year greater than 2021: ") ;; simple display message that appears after you input the money and tells you to input a desired year
;; used similar conditional statement as above to sort out malformed data in the years part
(define year (read)) (cond ((not( number? year ) )(display "ERROR: PRESS RUN AGAIN: Please only enter in a whole number greater than as the year")(exit 0));;if the inputted year is not a number will display an error message
                            ((not(positive? year ))(display "ERROR: PRESS RUN AGAIN: Please only enter positive whole number greater than 2021 as the year")(exit 0));; if inputted year is a negative number (or 0) it will display an error message
                             ( (<= year 2021)(display "ERROR: PRESS RUN AGAIN: Please only enter years in the future")(exit 0)));; if inputted year less than or equal to 2021 will display error message as you need to have you're money in the stock for a year to accumalte returns on it

(define yearsElasped(- year 2021)) ;; We want to a value so as our function will actually work, so we take away the inputted year from 2021 so our main calculation (money value) will actually work
(define x (- year 2021)) ;; making sure for the lambda x below that the x is on the same wavelenght as yearsElasped
;; for every year that goes by, this function starts by proudcing a rate of .99% (unless a year  2021 or below is entered as it won't give you a return due to it not being a full year
;; so the function will always produce -1) at the start and then increases in a formula (.99 +(x-1 * .02))
;;Long term stock returns returns always vary so I just made a baseline % increase that will always increase for 50 years
(define moneyacca (lambda (x) (if (<= x 0)yearsElasped(-(moneyacca (- x 1))(* yearsElasped .01)))))

(define moneyValue (if (<= yearsElasped 0)-1 (+(ceiling(* money (moneyacca yearsElasped  )))))) ;; Ceiling is used to cut out long winded decimal figures as we are dealing with money. the moneyacca answer from recursive function above is then multipled by the money you inputted


 ;;Display method for final output                    
(display " In the year ") (display year) (display " you're money will be worth: ")moneyValue(cond (( <= moneyValue 20000) "ERM... Maybe keep it in the stock a little longer!")
                                                                                              ((<= moneyValue 30000) "Nice! your money is going up");; simple message to add on 
                                                                                        ((<= moneyValue 40000) "WOAH! You made over 10000! Investing is easy huh.") ;; simple message to add on
                                                                                        ((<= moneyValue 80000) "CONGRATSSS!! You risk has turned into an unbelivable reward" ) ;; simple message to add on
                                                                                        ((<= moneyValue 100000000)"With all these profits you should definitely get into the real estate market")) ;; simple message to add on

;; For this code to run. simply press the run button on the top right hand side of screen and input X amount of money and what year you want to see how much that investment will be
;; If malformed data is entered, the system will break with the exit code and display and error message insisting you to press run again       
;; you can put in whatever value you want into the money input or year and see how the system will organise if it should contoniue with the program or break on itself
;; Thank uou for taking the time to look at my project 