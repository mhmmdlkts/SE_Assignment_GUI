# Software Engineering Assignment 5

Design a software application that manages and renders user interface (UI) components on the
screen. The following types of components shall be supported:
- Label : an area for a short unmodifiable text.
- TextField : an editable area for a single line of text.
- Checkbox : an item that can be selected or deselected.
- Group : a titled collection of components; nesting of groups shall be supported.
1) Design a suitable (structured) textual representation to persist UI components (containing
information like type of the component, text, ...). Also give a sample description in a file with at least
one Group-component containing 3 different types of components, one of which is again a
non-empty Group-component.
2) Implement an application that is able to read such a description of UI components and build
the object-hierarchy in memory. Use an appropriate OO-oriented design.
3) Conceptually, the application shall support different representations of the components
(e.g., purely ASCII text based, or graphically using appropriate frameworks such as Java Swing, or
a simple 2D drawing). User interaction (such as filling in the Textfield or selecting a Checkbox etc.)
is not required. Implement one such representation.
