cmake_minimum_required(VERSION 3.18.1)
project("vulkan_renderer")

find_library(log-lib log)
find_library(android-lib android)
find_library(vulkan-lib vulkan)

add_library(vulkan_renderer SHARED vulkan_renderer.cpp)

target_link_libraries(vulkan_renderer
        ${log-lib}
        ${android-lib}
        ${vulkan-lib})
