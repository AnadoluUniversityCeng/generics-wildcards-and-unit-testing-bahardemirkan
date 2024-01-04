[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/YLuAwWuq)
# The template repository for the BIM207 course's Project:  2023-2024 Fall
The project template  for the BIM207 course - Fall 2024


* BIM207 Project has 2 Parts, 50 points each.
* Part-I: Writing a failing test case to demonstrate a bug.
* Part-II: Implement a generic method both using wildcards and type parameters.


## Part-I
* For a certain user input(s) the function/method **infiniteLoop** enters an infinite loop.
* This is an intentional bug, do not fix it.
* Instead, write a *failing* junit test case to demonstrate the bug.

## Part-II

* Please implement an increment-by-one method that increments the frequency of a                                                                                                                                                                         given key by one in a count/frequency map.
* There's often a case when we can declare a generic method using [either wildcards or type parameters](https://www.baeldung.com/java-generics-type-parameter-vs-wildcard).
* Implement the generic method in both possible two ways (i.e. using wildcards `<?>` and type parameters `<E>`).
* So that, pre-written test cases all pass. Do not modify the test cases.
* @param map the frequency map, keys can be any Enum (built-in or custom), values are Integer.
* @param key any Enum type should work. Hint: [How do I decrypt "Enum<E extends Enum<E>>"?](http://www.angelikalanger.com/GenericsFAQ/FAQSections/TypeParameters.html#FAQ106)