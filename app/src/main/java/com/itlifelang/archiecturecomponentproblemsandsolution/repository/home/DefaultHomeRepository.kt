package com.itlifelang.archiecturecomponentproblemsandsolution.repository.home

import com.itlifelang.archiecturecomponentproblemsandsolution.data.api.Api

// Todo: Make [DefaultHomeRepository] implements [HomeRepository]. After that, let's implement
// Todo: [getPersons] with [liveData] builder.
class DefaultHomeRepository(private val api: Api)
