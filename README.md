# Repository Guide

## Structure

In the root of the repository is a batch command file **feijoa.bat** which
is to be called from the terminal in order to regenerate the parser and lexer for Feijoa and run Feijoa files.

All language implementation files are in the folder **Parsing**.

All example projects are in the folder **Projects**, 
which also contains syntax demo files in its subfolder **Demos**.

The root also contains an author's diary.

## Setup 
Currently, shell commands are Winows only.

After cloning / downloading the repository, the parser and lexer for Feijoa will need to be regenerated.

Navigate to the local repository folder and run `./feijoa -p` from your favourite terminal.

To call the feijoa command from anywhere on your machine, add the clone folder to the **PATH** environment variable.

Feijoa code files have the extension **.fj**.


## Feijoa Commands

Note: the .fj extension is optional when executing commands

### --- Regenerate .fj parser ---

`./feijoa -p [filename]`

(update the parser for Feijoa and, if a file is specified, run it)

### --- Run .fj files ---

`./feijoa -r <filename>`

Run the code of a file

Example command: `./feijoa -r Projects/Demos/assign`

