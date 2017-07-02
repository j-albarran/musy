# **Musy**
## Programming Language for easy music creation

![Musy](http://i.imgur.com/bqju77K.jpg)

## Introduction
Music is something that can be created with almost anything and with a good ear. These things vary from actual musical instruments to something as simple as a table top. However, not everybody has the know-how of using a musical instrument or creating one. Some of these people may have studied music and may know how to create music but wielding an instrument is not the same thing. You can have the knowledge but if you don’t have the talent or abilities, you may never be able to create music on your own. That is what we want to tackle with Musy.

On a programming standpoint, it may become complicated to generate music. Additionally, music composers may know little to nothing of how to program. With Musy, we have taken the initiative to create a programming language that simplifies this task. This will permit an user to focus more on their creativity and not in their code correctness. Even though it will be easier to code, it is recommended for the user to be familiarized with musical terminology and nomenclature. The reason for this is that if the user does not have any previous music knowledge, he will have problems identifying the meaning of certain pre-defined values that represent a note in a specific tone or the duration of it. Yet, any user is welcome to use this language.

From another perspective, this programming language could be used as a tool to learn music. The language syntax is simple enough and the learning curve isn’t steep. The user could experiment with different sounds at different tones, listen to what they sound like and how to differentiate each one. It could also be used as a complementary tool for a music course. This means that users that have no music experience could take advantage of Musy, even if the primary purpose of this language is to help in composing music. 




## Language Features
Selection of instrument to play the song
Creation of notes in different tones (examples: A4, A5, B3, C2)
Creation of parts of a song (examples: chorus, intro, bridge, solo)
Unification of these parts to form the song
Define beat of the song
Prints a visual representation of the selected song’s stave
Example of a Program

    New Song : mySong
    New Phrase : part1
    Add Note A4 1/2 To part1
    Add Note B6 1/1 To part1
    Add Note C3 1/4 To part1
    New Phrase : part2
    Add Note E7 1/4 To part2
    Add Note F2 1/4 To part2
    Add Note A5 1/4 To part2
    Tempo : 300
    Play : mySong
    Compose : mySong




## Implementation & Requirement Tools
The programming language will use Jflex to do the lexical analysis and for compilation it will use JavaCC. It is noticeable that the intermediate programming language will be Java and this is because we will be working with an imported library called Jmusic. This library includes most of the functionalities for creating a song such as the notes and their duration, the instruments to play, the beat of the song and it's starting time and ending time. After building up your musical piece you can then write it to a midi file with its corresponding title.

## Project Plan & Timeline
For Musy to work, we will divide our tasks in order to be as efficient as possible. We will start with the Lexical Analyzer, the Syntax Analyzer, and the Intermediate Code. This is meant to be phase 2, so this will be done by April 15. After this, it will only be a matter of testing and debugging. Documentation will be done on the run, but the final documentation and the website will be up by May 10 and the final report by the date of the final exam. For a visual look into the task division, please refer to the timeline below. 
A detailed description of the tasks mentioned in the timeline is as follows:

### Planning
Generate ideas to come up with an application oriented programming language using an existing language as intermediary. Analysis of the music libraries included in the different programming languages to determine the best language to use as intermediary.
Lexical Analyzer: Develop a lexical analyzer or scanner which ultimately will perform the task of converting a program code into a series of tokens by removing whitespaces or comments in the code.

### Syntax Analyzer 
Develop a syntax analyzer or parser that looks for errors in the code and generates a parse tree. Intermediate Code: Develop the code that will read and, using both Syntax and Lexical Analyzers, compile what the user writes using the language syntax.

### Debug and Test
Perform multiple integration tests between the syntax and lexical analyzers and the intermediate code and debug if necessary.

### Documentation and website
Document each part of the code so that any type of user can understand how to use the language and how it works. This documentation should include an explanation of the language syntax.

### Final Report 
Generate a final report containing all the documentation consisting of the translator architecture, interfaces between modules, and the test methodology. It will give an overview of the project and the methodology used to build the programming language Musy.

However, as every project is, there are ***risks that could happen***. These may include:

### Lexical Analyzer and/or Syntax Analyzer not working
Musy uses external libraries for its analyzers and if a part of the code related to these analyzers malfunctions, it means that there was a bad implementation of the library somewhere in the code. This could have a simple or a complicated fix. The simple case would be that to recover from an error like this, you would only have to visit the recent implementations and start debugging from this points onward. But if the error is within the library itself, then a significant amount of time could go to waste on trying to fix an architecture related error.
