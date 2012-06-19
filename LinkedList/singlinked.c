#include <stdio.h>
#include <stdlib.h>

typedef struct singlink { int value; struct singlink *next; } singlink;

int main()
{
   singlink *current, *head;
   int i;

   head = NULL;

   for (i = 1; i <= 10; i++)
   {
      current = (singlink *)malloc(sizeof(singlink));
      current->value = i*2;
      current->next = head;
      head = current;
   }

   current = head;

   while (current)
   {
      printf("Value inserted: %d\n", current->value);
      current = current->next;
   }
   return 0;
}
