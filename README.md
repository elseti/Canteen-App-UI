# Canteen-SUTD-UI
List of Java classesa

MainActivity: Empty for now. I configured the main class to GuestMainMenu in my Android Studio for now.

GuestMainMenu: The main class which lets users click which stall they want to browse.

StallMenu: The class displaying the foods in a particular stall. Shown when the user clicks a button in GuestMainMenu.

MenuItem: Java class defining a MenuItem object

Stall: Java class defining a Stall Object

StallButtonAdapter: Adapter for Recyclerview used in GuestMainMenu class. (recycles stall buttons)

FoodAdapter: Adapter for Recyclerview used in StallMenu class. (recycles menu items / food)


XML Files

GuestMainMenu uses guest_main_menu.xml
StallMenu uses stall_menu.xml
StallButtonAdapter uses each element of stall_button.xml to recycle the button
FoodAdapter uses each element of food_item.xml to recycle each food item view

Additional XML file: food_item_staff.xml
food_item_staff.xml is basically the same as food_item.xml except that it has an "edit" button at the right.
This is used for editing the food items, but is only accessible for staffs.


Other notes:
There are ids for each element in the XML files. 
Used recyclerview for both buttons and food items. 
Images for each MenuItem is currently all Drawables.
The Adapter classes may be a bit confusing, but you can find out more in the Recyclerview documentation for Android Studio
