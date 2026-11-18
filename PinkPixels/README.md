# Pink Pixels icon pack

Build the APK with no Android Studio (uses GitHub's free servers):

1. Make a free GitHub account and a new repo (private is fine).
2. Unzip this project, then upload ALL its files/folders to the repo.
   If the `.github` folder doesn't upload, use Add file > Create new file,
   name it `.github/workflows/build.yml` and paste in the contents.
3. Open the repo's Actions tab, wait for "Build APK" to finish (a few minutes).
4. Open the finished run, download the `PinkPixels-APK` artifact, unzip, install the .apk.
5. In your launcher (Nova, Lawnchair, Niagara...) pick Pink Pixels as the icon pack.

Add more apps: put a PNG in app/src/main/res/drawable-nodpi/ and add a line to
BOTH app/src/main/assets/appfilter.xml and app/src/main/res/xml/appfilter.xml
(plus assets/drawable.xml so it shows in the picker).
