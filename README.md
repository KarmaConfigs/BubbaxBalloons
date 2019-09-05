# BubbaxBalloons

BubbaxBalloons is a custom version of EpicBalloons, wich is open source due the original (EpicBalloons) is an open source too. 

So me, the developer of the server play.bubbax.net, decided to make it open source too.


# How to add custom heads

To add custom heads you have to go to [MineSkin](https://mineskin.org) and generate a skin via username or custom skin file, then, you have to copy the texture url wich has this format http://textures.minecraft.net/texture/34e8b019c9f44d51786b1272bf71219e3761f7ab06adb4c94a8460098b3c7c30 and copy the last value **_34e8b019c9f44d51786b1272bf71219e3761f7ab06adb4c94a8460098b3c7c30_**

Once you have copied it, you have to go to a Base64 encoder, you can use [this one](https://www.base64encode.org) and paste the thing that you copied, and add this "}}}

"**_34e8b019c9f44d51786b1272bf71219e3761f7ab06adb4c94a8460098b3c7c30"}}}_** and click on "Encode"


Then, you'll have to copy the encoded value, and paste it on " EpicHeads> ItemsUtils.getCustomSkull("**_Encoded value_**") "
