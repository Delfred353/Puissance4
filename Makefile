##
## ISTIC PROJECT, 2021
## Makefile
## File description:
## Makefile for Puissance4 Project
##

SRC =	LauchPuissance4.java \
		puissance4.java \
		Display.java \
		IA.java \
		repre.java \
		verifWin.java \
		LauchPuissance4.java

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
