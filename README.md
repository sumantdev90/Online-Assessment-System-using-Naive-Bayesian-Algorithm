Online-Classification-System-using-Naive-Bayesian-Algorithm
===========================================================
This software uses the standard online examination system interface having mcq questions having 4 options. The weight is not predefined but is calculted on the basis of accuracy and the number of students that solved that question.
This program uses the training set set by the expert to classify the test set using the Naive Bayesian Algorithm.
The program also undertakes whether the min_threshold_time has exceeded or not If not , then it means that the student has eithed copied or just blindly guessed leading to zero marks for that question. Similarly marks will be provided for difernent questions based on the weight of the question and the Expert_difficulty_level.

Create a database "assessment" having tables questions(qid,statement, opt1, opt2 ,opt3, opt4, corr_ans), students, training_set. Refer to the code to find out the structure of the table.
