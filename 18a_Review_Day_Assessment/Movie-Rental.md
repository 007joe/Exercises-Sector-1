# Movie Rental

1. Create a new class that represents a *Movie Rental*.
2. Add  *title*, *format*, *is premium movie*, and *rental price* properties to the Movie Rental class:
    * `title`: indicates the title of the movie.
    * `format`: indicates the format of the movie (VHS, DVD, or Blu-ray).
    * `is premium movie`: indicates if the movie is a premium movie. Premium movies cost more.
    * `rental price`: indicates the rental price (VHS $0.99, DVD $1.99, BluRay $2.99). Premium movies add an additional $1.00 to the rental price.
3. Before moving to step 4, check in your in-progress code to your repository. Make sure it compiles first.    
4. Create a constructor that accepts `title`, `format`, and `is premium movie`.
5. Instantiate at least 3 movie rental objects, populate them with sample data and then add them to an ArrayList. Do this in a separate classes main method that will be used to run your program (ex: App class).
6. Check in your in-progress code to your repository. Make sure it compiles first.    
7. In the *Movie Rental* class, override the `toString()` method and have it return a string in the form of:  `"MOVIE - {title} - {format} {rental price}"` where `{title}`, `{format}`, and `{rental price}` are placeholders for the actual values. The values from the object should be shown in the string where `{variable-name}` is indicated.
8. Check in your in-progress code to your repository. Make sure it compiles first.    
9. Back in the application class, create a private method called `printMovieList` that takes an ArrayList from the previous step and prints out each movie and it's data. (Hint: can you call `toString()`).  You should be 'passing' the ArrayList into this private method from the main method. Do not write this code in the main method.
10. Check in your in-progress code to your repository. Make sure it compiles first.    
11. Create a new public method in the *Movie Rental* class that determines a movie's late fee using an input parameter: `int daysLate`:
    * Return $0.00 if `daysLate` is equal to 0.
    * Return $1.99 if `daysLate` is equal to 1.
    * Return $3.99 if `daysLate` is equal to 2.
    * Return $19.99 if `daysLate` is equal to 3 or more.
12. Check in your in-progress code to your repository. Make sure it compiles first.    
13. Implement unit tests to validate the functionality of:
    * The rental price calculation 
    * The late fee calculation
14. Create a new private method in your App class to print out the movie data to a file. You can call this method at the end of your main method.     
15. Check in your final code to your repository. Make sure it compiles first.  
