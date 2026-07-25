package com.platform.jenkins.stages

import com.platform.jenkins.context.BuildContext

/**
 * Minimal contract for a pipeline stage.
 *
 * Concrete stages can implement this interface to define their behavior.
 */
interface PipelineStage {

    /**
     * Execute the stage using the provided build context.
     *
     * @param context runtime context for the current build
     */
    void run(BuildContext context)
}
