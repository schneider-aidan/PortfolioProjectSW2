# Portfolio Part 1: Component Brainstorming

- Aidan Schneider: 
- Schneider.1250: 
- 02/16/24: 

## Assignment Overview

The overall goal of the portfolio project is to have you design and implement
your own OSU component. There are no limits to what you choose to design and
implement, but your component must fit within the constraints of our software
sequence discipline. In other words, the component must extend from Standard and
must include both a kernel and a secondary interface.

Because this is a daunting project, we will be providing you with a series of
activities to aid in your design decisions. For example, the point of this
assignment is to help you brainstorm a few possible components and get some
feedback. For each of these components, you will need to specify the high-level
design in terms of the software sequence discipline. In other words, you will
describe a component, select a few kernel methods for your component, and select
a few secondary methods to layer on top of your kernel methods.

You are not required to specify contracts at this time. However, you are welcome
to be as detailed as you'd like. More detail means you will be able to get more
detailed feedback, which may help you decide which component to ultimately
implement.

## Assignment Checklist

Because these documents are long and full of text, you will be supplied with
a quick overview of what you need to do to get the assignment done as follows:

### Getting Started Tasks

- [X] I have added my name to the top of this document
- [X] I have added my dot number to the top of this document
- [X] I have added the due date to the top of this document
- [X] I have read the assignment overview in the "Assignment Overview" section
- [X] I have read the assignment learning objectives in the "Assignment Learning Objectives" section
- [X] I have read the assignment rubric in the "Assignment Rubric" section
- [X] I have read this checklist

### Ongoing Tasks

- [X] I have shared my interests in the "Pre-Assignment" section
- [X] I have drafted my first component idea in the "Component Designs" section
- [X] I have drafted my second component idea in the "Component Designs" section
- [X] I have dradted my third component idea in the "Component Designs" section

### Submission Tasks

- [X] I have shared assignment feedback in the "Assignment Feedback" section
- [X] I have converted this document to a PDF
- [X] I am prepared to submit the PDF on Carmen
- [X] I am prepared to give my peers feedback on their ideas

## Assignment Learning Objectives

Without learning objectives, there really is no clear reason why a particular
assessment or activity exists. Therefore, to be completely transparent, here is
what we're hoping you will learn through this particular aspect of the portfolio
project. Specifically, students should be able to:

1. Integrate their areas of interest in their personal lives and/or careers with
   their knowledge of software design
2. Determine the achievablility of a software design given time constraints
3. Design high-level software components following the software sequence
   discipline

## Assignment Rubric: 10 Points

Again, to be completely transparent, most of the portfolio project, except the
final submission, is designed as a formative assessment. Formative assessments
are meant to provide ongoing feedback in the learning process. Therefore,
the rubric is designed to assess the learning objectives *directly* in a way
that is low stakes—meaning you shouldn't have to worry about the grade. Just
do good work.

1. (3 points) Each design must align with your personal values and long-term
   goals. Because the goal of this project is to help your build out a
   portfolio, you really ought to care about what you're designing. We'll give
   you a chance to share your personal values, interests, and long-term goals
   below.
2. (3 points) Each design must be achievable over the course of a single
   semester. Don't be afraid to design something very small. There is no shame
   in keeping it simple.
3. (4 points) Each design must fit within the software sequence discipline. In
   other words, your design should expect to inherit from Standard, and it
   should contain both kernel and secondary methods. Also, null and aliasing
   must be avoided, when possible. The methods themselves must also be in
   justifiable locations, such as kernel or secondary.

## Pre-Assignment

> Before you jump in, we want you to take a moment to share your interests
> below. Use this space to talk about your career goals as well as your personal
> hobbies. These will help you clarify your values before you start
> brainstorming. Plus it helps us get to know you better! Feel free to share
> images in this section.

When it comes to my career goals I am not to sure where I would like to end up. I think that
if I were to end up in a software job I would be fine with it, even though I am more interested in 
the hardware aspect of ECE. So far I enjoy the circuit design aspect more than coding.
Some of my hobbies are watching soccer, swimming, lifting, cooking, and playing soccer.

## Assignment

As previously stated, you are tasked with brainstorming 3 possible components.
To aid you in this process, we have provided some example components that may
help you in your brainstorming. These components are organized by CSE
specializations.

- Artificial Intelligence
  - Artificial Neuron
  - Activation Function
  - Graphs
  - Search
- Computer Graphics and Game Design
  - Pixel
  - Polygon
  - Geometry
  - Pathing
- Database Systems and Data Analytics
  - Object Relational Mapping (ORM)
  - Any Data Model
  - Scraping
  - Data Mining
- Information and Computation Assurance
  - Password Hashing
- Computer Networking
  - Packet
  - MAC Address
  - IP Address
- Computer Systems
  - Complex Logic Gate
  - Semiconductor
- Software Engineering
  - Unit Testing
  - Performance Testing
- Individualized Option (e.g., X + CS)
  - Mathematical Matrix
  - Music Playlist

There is no requirement that you make use of any of the subdisciplines above.
If you want to model something from the real-world, go for it! Very common early
object projects usually attempt to model real-world systems like banks, cars,
etc. Make of this whatever seems interesting to you, and keep in mind that
you're just brainstorming right now. You do not have to commit to anything.

### Example Component

With all that in mind, here's an example component you can use for reference.
Feel free to use this example as the groundwork for your own components below.

- Example Component: `Point3D`
  - **Description**: The purpose of this component is to model a 3-dimensional point.
    Our intent with this design was to keep a simple kernel that provides getters and
    setters for the three underyling coordinates. Then, we provide more complex
    mathematical operations in the secondary interface. It might be possible to
    create an immutable version of the class by removing the setters and instead
    having all secondary methods return new points. However, this design seems more
    inline with NaturalNumber.
  - **Kernel Methods**:
    - `double getX()`: gets the x-coordinate of `this`
    - `double getY()`: gets the y-coordinate of `this`
    - `double getZ()`: gets the z-coordinate of `this`
    - `double setX(double x)`: sets the x-coordinate of `this`
    - `double setY(double y)`: sets the y-coordinate of `this`
    - `double setZ(double z)`: sets the z-coordinate of `this`
  - **Secondary Methods**:
    - `void translate(double x, double y, double z)`: moves `this` by translating
      each coordinate by `x`, `y`, and `z`, respectively
    - `void translate(Point3D p)`: moves `this` by treating `p` as a vector
    - `void move(double x, double y, double z)`: moves `this` by overwriting each
      coordinate with `x`, `y`, and `z`, respectively
    - `void move(Point3D p)`: moves `this` to `p`
    - `double distance(Point3D p)`: gives the distance between `this` and `p`
    - `Point3D vectorTo(Point3D p)`: gives the vector from `this` to `p`
    - `boolean isOrigin()`: returns `true` if all three coordinates are zero

Keep in mind that the general idea when putting together these layered designs
is to put the minimal implementation in the kernel. In this case, the kernel is
only responsible for giving back the coordinates of the point. The secondary
methods use these getters and setters to perform more complex operations like
translating the point or computing the distance between two points.

Also, keep in mind that we don't know the underlying implementation. It would be
completely reasonable to create a `Point3D1L` class which layers the kernel on
top of the existing `Point` class in Java. It would also be reasonable to
implement `Point3D2` on top of three doubles and `Point3D3` on top of an array.
Do not worry about your implementations at this time.

On top of everything above, there is no expectation that you have a perfect
design. Part of the goal of this project is to have you actually use your
component once it's implemented to do something interesting. At which point, you
will likely refine your design to make your implementation easier to use.

### Component Designs

> Please use this section to share your designs.


- Component Design #1: Rectangle
  - **Description**:
  - The purpose of this component is to model a rectangle using getters and setters of the four corner coordinates
  - for the kernel methods and then use those values in the secondary methods to get other useful measurements
  - like the length and width of the rectangle or the area. The rectangle will have its sides parallel to the x and y axis.
  - **Kernel Methods**:
  - `double SetBL`(double BLx, double BLy): sets the bootom-left coordinate in the x-y plane of `this`
  - `double SetBR`(double BRx, double BRy): sets the bootom-right coordinate in the x-y plane of `this`
  - `double SetTL`(double TLx, double TLy): sets the top-left coordinate in the x-y plane of `this`
  - `double SetTR`(double TRx, double TRy): sets the top-right coordinate in the x-y plane of `this`
  - `double GetBLx`(): gets the bootom-left x coordinate in the x-y plane of `this`
  - `double GetBLy`(): gets the bootom-left y coordinate in the x-y plane of `this`
  - `double GetBRx`(): gets the bootom-right x coordinate in the x-y plane of `this`
  - `double GetBRy`(): gets the bootom-right y coordinate in the x-y plane of `this`
  - `double GetTLx`(): gets the top-left x coordinate in the x-y plane of `this`
  - `double GetTLy`(): gets the top-left y coordinate in the x-y plane of `this`
  - `double GetTRx`(): gets the top-right x coordinate in the x-y plane of `this`
  - `double GetTRy`(): gets the top-right y coordinate in the x-y plane of `this`

  - **Secondary Methods**:
  - `double rectangleHeight()` Returns the length of the left and right sides of `this`
  - `double rectangleWidth()` Returns the length of the top and bottom sides of `this`
  - `double rectangleArea()` Returns the area of `this`
  - `double rectanglePerimeter()` Returns the perimeter of `this`
  - `boolean pointInRectangle(double x, double y)` Determines if a coordinate (`x`,`y`) is inside of `this`
  - `boolean rectangleCentered(double x, double y)` Determines if `this` is centered around the coordinate (`x`,`y`)
  - `void findCenter(double x, double y)` Returns the coordinates of the center of `this` in `x` and `y`
  - `boolean fitInside(Rectangle x)` Determines if `this` would fit inside of another rectangle `x`
  - `double setHeight(double length)` Changes the coordinates on the top side of `this` to make the height match `length`
  - `double setWidth(double length)` Changes the coordinates on the right side of `this` to make the width match `length`


- Component Design #2: Book
  - **Description**:
  - The purpose of this component is to create a tracker of which books you have read as well as your ratings for those
  - books, the genres of those books, and the lengths of those books. The idea behind it is that it would make it
  - easy to track how much one has read in a year and easy to compare genres and feelings on books with friends. 
  - 
  - **Kernel Methods**:
  - `String setBookTitle(String title)` Sets the `title` of `this`
  - `int setBookLength(int length)` Sets the `length in` # of pages of `this`
  - `void addToBookList(Set<Book> books)` Adds `this` to a list of `books`
  - `String getBookTitle()` Returns `this`'s title
  - `int getBookLength()` Returns `this`'s length in # of pages
  - `void removeFromBookList(Set<Book> books)` Removes `this` from the list of books
  - **Secondary Methods**:
  - `String changeBookTitle(String newTitle)` Changes `this`'s book's title to `newTitle` and returns the old title
  - `int changeBookLength(int length)` Changes `this`'s # of pages to the new `length` and returns the old length
  - `Book pickRandomBook(Set<Book> books)` Returns a random book in the set of `books`
  - `int lengthOfReadingList(Set<Book> books)` Returns the cumulative length of all `books`
  - 
  - 


- Component Design #3: Cookbook
  - **Description**:
  - The purpose of this component is to create a changable cookbook that will keep track of all ingredients on hand
  - and all entered recipes in order to know what possible recipes are able to be made at any time. The component
  - will be a map of the recipes that are added. It will also have a component variable of a map of ingredients.
  - **Kernel Methods**:
  - `void addIngredient(Map<String, int> ingredients, String ingredient, int amount)` Adds an `ingredient` to your list of `ingredients` and the `amount` of 
  - ingredient(users job to keep track of unit on `amount`)
  - `void addRecipe(String recipeName, String recipe)` Adds a `recipe` of name `recipeName` to `this`
  - `void removeIngredient(Map<String, int> ingredients, String ingredient, int amount)` Removes a certain `amount` of `ingredient` from `ingredients`
  - `Map.Pair<String, String> removeRecipe(String recipeName)` Removes an entry of name `recipeName` from `this` and returns in
  - 
  - **Secondary Methods**:
  - `void possibleRecipes(Map<String, int> ingredients)` Checks which recipes are possible in `this` to make with current `ingredients`
  - `void recipeMade(String recipeName, Map<String, int> ingredients)` Removes whatever `ingredients` were used to make `recipeName`
  - `String changeRecipe(String recipeName, String newRecipe)` Changes the current `recipeName`'s recipe to `newRecipe` and returns the old one.
  - 
  - 

## Post-Assignment

The following sections detail everything that you should do once you've
completed the assignment.

### Submission

If you have completed the assignment using this template, we recommend that
you convert it to a PDF before submission. If you're not sure how, check out
this [Markdown to PDF guide][markdown-to-pdf-guide]. However, PDFs should be
created for you automatically every time you save, so just double check that
all your work is there before submitting.

### Peer Review

Following the completion of this assignment, you will be assigned three
students' component brainstorming assignments for review. Your job during the
peer review process is to help your peers flesh out their designs. Specifically,
you should be helping them determine which of their designs would be most
practical to complete this semester. When reviewing your peers' assignments,
please treat them with respect. Note also that we can see your comments, which
could help your case if you're looking to become a grader. Ultimately, we
recommend using the following feedback rubric to ensure that your feedback is
both helpful and respectful (you may want to render the markdown as HTML or a
PDF to read this rubric as a table).

| Criteria of Constructive Feedback | Missing                                                                                                                           | Developing                                                                                                                                                                                                                                | Meeting                                                                                                                                                               |
| --------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Specific                          | All feedback is general (not specific)                                                                                            | Some (but not all) feedback is specific and some examples may be provided.                                                                                                                                                                | All feedback is specific, with examples provided where possible                                                                                                       |
| Actionable                        | None of the feedback provides actionable items or suggestions for improvement                                                     | Some feedback provides suggestions for improvement, while some do not                                                                                                                                                                     | All (or nearly all) feedback is actionable; most criticisms are followed by suggestions for improvement                                                               |
| Prioritized                       | Feedback provides only major or minor concerns, but not both. Major and minar concerns are not labeled or feedback is unorganized | Feedback provides both major and minor concerns, but it is not clear which is which and/or the feedback is not as well organized as it could be                                                                                           | Feedback clearly labels major and minor concerns. Feedback is organized in a way that allows the reader to easily understand which points to prioritize in a revision |
| Balanced                          | Feedback describes either strengths or areas of improvement, but not both                                                         | Feedback describes both strengths and areas for improvement, but it is more heavily weighted towards one or the other, and/or descusses both but does not clearly identify which part of the feedback is a strength/area for improvement  | Feedback provides balanced discussion of the document's strengths and areas for improvement. It is clear which piece of feedback is which                             |
| Tactful                           | Overall tone and language are not appropriate (e.g., not considerate, could be interpreted as personal criticism or attack)       | Overall feedback tone and language are general positive, tactul, and non-threatening, but one or more feedback comments could be interpretted as not tactful and/or feedback leans toward personal criticism, not focused on the document | Feedback tone and language are positive, tactful, and non-threatening. Feedback addesses the document, not the writer                                                 |

### Assignment Feedback

> Now that you've had a chance to complete the assignment, is there anything you
> would like to say about the assignment? For example, are there any resources
> that could help you complete this assignment? Feel free to use the feedback
> rubric above when reviewing this assignment.

<!-- TODO: share your feedback here -->
I think that once I got one component that I saw as viable, that putting in the same energy to come up with two more was difficult and that
many people who complete this assignment will go into it with one component in mind and will be thinking too narrowly for this activity
to cause them to create anything different than their preconcieved component.

[markdown-to-pdf-guide]: https://therenegadecoder.com/blog/how-to-convert-markdown-to-a-pdf-3-quick-solutions/
