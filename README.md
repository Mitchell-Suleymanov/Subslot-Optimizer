# Subslot-Optimizer
Subslot optimizer program for the game Kingdom Hearts Union Cross

The purpose of this program is to optimize the subslots on your keyblade. 
The game does not have a feature which lets you optimize automatically, so this program will be able to do that for you.

For now, it will be made in Java with some help from Swing, but I plan to make a javascript version and add it to jsfiddle so others can see that this is possible and easy to implement in the game.

What we know:
1. Currently 15 keyblades. New ones are very rarely added.
2. Subslots are different for each keyblade, but the 120 
slots for each will never change.
3. Maximum medal inventory is at 2400. Therefore, we will 
not have to deal with extremely large numbers.
4. Medals have 7 different categories, one of which we will
ignore.
5. Medals that can be counted in subslots aren't so easy to
obtain, at least not the more useful high tier ones.
6. Only 120 subslots per keyblade.
7. Each medal gets 1 use per keyblade.
8. By default, the element is what needs to match. Some subslots
however are specified for the correct allignment and element.
9. No subslot as of now requires a specific alignment only, 
ignoring elements.
10. Subslots must be linked for bonuses to matter.


Information on Medals:
- Medals have 3 Elements: Power, Speed, and Magic.
- Medals have 2 Alignments: Upright and Reverse.
- Medals have 8 tiers.
- There is also a colorless type for medals, but this can
be ignored. 
- Higher tier medals give stronger bonuses.


What We Need:
1. Ask the user for every medal they have. Be very specific, you
need to know their Element, Allignment, and Tier.
2. Ask the user which keyblade they will try to maximize. 


Algorithm:
1. Starting from the start of the keyblade, fill in specific 
subslots. This means subslots that require an element and an 
alignment.
2. When filling in subslots, use the highest available tier of
that medal.
3. For subslots that do not specify an alignment, use the medal
for that element with the highest tier.
4. If an upright and reverse medal have equal tier level, default
to using upright first.
5. If you fill in every subslot, then stop.
6. If you do not have enough to fill in the next subslot, then
go to the end of the subslot list and remove a medal that fits
the elemental requirement of the next slot. Then return to step 2.
7. If you do not have any medal left that can fit the requirement,
go to the end of the keyblade and remove every subslot specific 
medal (subslot that require element and alignment).
8. Starting from the end of your current subslot position, go
backwards and replace and medal that has a tier lower than the
ones you just took out.
9. At this point, the keyblade should have its subslots optimized.
10. Run a loop to go through the subslots until it reaches the end
of where you reached. Add up the boosts. Print them.
11. Ask the user which keyblade they want optimized next. Repeat.
