import Settings._

lazy val advanced = Project(
  id = "advanced",
  base = file("modules/advanced")
).settings(advancedSettings)

lazy val gui = Project(
  id = "gui",
  base = file("modules/gui")
).settings(guiSettings)

// Custom Tasks

/*
lazy val packageAdvance = taskKey[Unit]
packageAdvance := Def
  .sequential(
    (advanced / publishLocal)
  )
  .value*/
