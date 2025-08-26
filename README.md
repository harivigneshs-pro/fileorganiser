<img width="3256" height="2716" alt="image" src="https://github.com/user-attachments/assets/f14ac0bf-af02-40c4-a917-28fa9a1913fd" /># fileorganiser
Project Title & Brief Description
Title: File Organiser and Duplicate File Finder Tool

Description:
when we download a file,by defaault it gets stored in either downloads or desktop organiser.
we used to forget to specify where it has to be stored .
As a result,we find a huge number of files of images,pdfs,mp3 that we download.it is boring to manually arrange those files according to the category.
what if there an option to segregate the files and sort them .
this will organise the files and folders.
morevoer when we download we umight download a copy.
this can also be detected by this tool.
by the option move/delete we can reduce the memmory occupied.
if required some of the files can also be excluded from the organising process.
also planned to integrate user defined rules for organising the files.
TARGET USERS:
Students, professionals, and anyone who needs to keep their computer storage organized and clutter-free.

CLASS DIAGRAM:
<img width="794" height="659" alt="Untitled Diagram drawio" src="https://github.com/user-attachments/assets/6c40a177-480f-4a1e-9b1c-0597895c65a3" />


Explanation of OOP Concepts Used
Encapsulation:
Each FileItem object stores its own properties (name, path, type, hash).
Inheritance:
DocumentFile, ImageFile, VideoFile extend FileItem.
Polymorphism:
organize() behaves differently for each file type (e.g., images into “Images” folder, PDFs into “Documents”).
Abstraction:
User interacts with simple functions (organize, find duplicates) without knowing hashing logic internally.
programming languageto be used : java

FileOrganizer
├── src
│   ├── Main.java
│   ├── FileOrganizer.java
│   ├── DuplicateFinder.java
│   ├── FileHasher.java
│   └── ReportGenerator.java


