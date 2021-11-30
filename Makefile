##
## ISTIC PROJECT, 2021
## Makefile
## File description:
## Makefile for Scrabble Project
##

SRC =	Puissance4.java \
		repre.java \
		IA.java

NAME = 	Puissance4

C_OBJ =	$(SRC:.c=.o)

CFLAGS = -std=gnu11 -Wextra -I include/ -g

RM =	@find . \( -name "*.o" -o -name "*~" -o -name "vgcore*" \) -delete

all: 	$(NAME)

$(NAME):
	javac $(SRC)
	$(RM)

clean:
	$(RM)

fclean:	clean
	$(RM)

re: clean all