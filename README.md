# Diagonal Leaves
This mod allows leaves to connect diagonally, preventing decay in scenarios like this:
\
\
![IMAGE DESCRIPTION: An image showing a test case of an oak log and three oak leaves placed diagonally in a Minecraft world, comparing Minecraft's vanilla leaves and logs logic with the mod's. In vanilla, all leaves have distance seven, shown with red text, while with the mod the logs have distances two, four and six instead. shown with green text.](https://cdn.modrinth.com/data/cached_images/57302169c918ff77a300f83b28a44905cd10f131.png)
\
\
In vanilla (shown with red) the leaves never find any neighbours, so their distance is seven, while with the mod (shown in green) the distance is checked and increments by one for each axis-offset, meaning face connections increase distance by one, edge connections by two and corner connections by three.
## Ok, cool but why, though?
Vanilla minecraft can be very annoying when it comes to creating naturally generating custom trees which stray from the vanilla style and more towards an airier, more realistic style.\
Since vanilla only checks and propagates distance checks to leaves that are only face-adjacent, edge/vertex-adjacent leaves will be left out, which means they will decay unless set as persistent, leaving the player with the task of manually cleaning them up.\
This mod fixes this, although at the expense of making the loop run on all adjiacent 26 blocks instead of just the 6 face-adjacent ones.

## Compatibility
All mods who implement leaves using the `LeavesBlock` class and logs based on the `RotatedPillarBlock` class properly tagged as "minecraft:logs" should work out of the box.
### NOTE: This mod changes vanilla behaviour significantly. It may cause some of your builds (like leafstone) to break! You have been warned.